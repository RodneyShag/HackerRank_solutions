

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    let arr=nums.map(n=>n=(n%2==0)?n*2:n*3)

    return arr;
}

