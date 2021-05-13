//check if array1 elements are equal to square of array2 elements
//Normal O(n*2) method 
// function arraySquareEquivalence(arr1, arr2){
    
//     if(arr1.length != arr2.length){
//         return false;
//     }

//     for(let i=0;i<arr1.length;i++){
//         let index = arr2.indexOf(arr1[i] ** 2);
//         if(index == -1){
//             return false;
//         }
//         arr2.splice(index,1);
//     }
//     return true;
// }

// arraySquareEquivalence([1,2,3,4],[4,1,9,16]);

//Frequency Counter O(n) method :
function arraySquareEquivalence(arr1, arr2){
    
    //objects to store frequencies
    let frequencyCounter1 = {};
    let frequencyCounter2 = {};

    if(arr1.length != arr2.length){
        return false;
     }

     for(let val of arr1){
         frequencyCounter1[val] = (frequencyCounter1[val] || 0) + 1;
     }

     for(let val of arr2){
         frequencyCounter2[val] = (frequencyCounter2[val] || 0) + 1;
     }

     console.log(frequencyCounter1);
     console.log(frequencyCounter2);

     for(let key in frequencyCounter1){

         //key comparison
         if(!(key ** 2 in frequencyCounter2)){
             return false;
         }
        
         //value comparison
         if(frequencyCounter1[key] !== frequencyCounter2[key ** 2]){
             return false;
         }

     }

     return true;

}

arraySquareEquivalence([1,2,3,4,2],[4,1,9,16,4]);