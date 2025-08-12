var maxProduct = function(nums) {
    // let min =0;
    // let max = nums[0];
    // for(let i=0;i<nums.length;i++){
    //     if(nums[i]>=max){
    //         min = max;
    //         max = nums[i];
    //     }
    // }
    //  return (min-1)*(max-1);

    // 2nd way 
    nums.sort((a,b)=>a-b);
    return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    
    
};