/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
  const arry = [];
  for(let i = 0; i<arr.length;i++){
    // console.log(i)
    if(fn(arr[i],i)){
    arry.push(arr[i]);
  }
  }
    return arry;
  
};
