#include <vector>
using namespace std;
//question number 88 in c++
class Solution {
public:
    void merge(vector<int>& nums1, int nums1_count, vector<int>& nums2, int nums2_count) {
        int nums1_last_index = nums1_count - 1;
        int nums2_last_index = nums2_count - 1;
        int merge_index = nums1_count + nums2_count - 1;

        while (nums1_last_index >= 0 && nums2_last_index >= 0) {
            if (nums1[nums1_last_index] > nums2[nums2_last_index]) {
                nums1[merge_index] = nums1[nums1_last_index];
                nums1_last_index--;
            } else {
                nums1[merge_index] = nums2[nums2_last_index];
                nums2_last_index--;
            }
            merge_index--;
        }

        while (nums2_last_index >= 0) {
            nums1[merge_index] = nums2[nums2_last_index];
            nums2_last_index--;
            merge_index--;
        }
    }
};
