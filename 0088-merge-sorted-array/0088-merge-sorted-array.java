class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n]; // temporary array to store merged result
        int i = 0;  // pointer for nums1
        int j = 0;  // pointer for nums2
        int k = 0;  // pointer for temp

        // Merge nums1 and nums2 into temp
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        // Copy remaining elements (if any)
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        // Copy merged array back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }
}