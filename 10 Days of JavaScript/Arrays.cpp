

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    let lar=nums[0],slar=nums[0]
    for(let i=1;i<nums.length;i++)
    {
        if(nums[i]>lar){
            slar=lar;
            lar=nums[i];
            }
        if (nums[i]>slar && nums[i]<lar)
            slar=nums[i];

    }
    return slar;
}

