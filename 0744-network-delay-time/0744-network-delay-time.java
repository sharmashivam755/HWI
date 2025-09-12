import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> graph=new HashMap<>();
        for(int[] t:times) graph.computeIfAbsent(t[0],x->new ArrayList<>()).add(new int[]{t[1],t[2]});
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int node=cur[0],d=cur[1];
            if(d>dist[node]) continue;
            if(!graph.containsKey(node)) continue;
            for(int[] nei:graph.get(node)){
                int v=nei[0],w=nei[1];
                if(dist[node]+w<dist[v]){
                    dist[v]=dist[node]+w;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}
