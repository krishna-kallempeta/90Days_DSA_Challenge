var reverseString = function(s) {
    var start = 0;
    var end = s.length-1;
    while(start <= end){
        var temp = s[start];
        s[start] = s[end];
        s[end]=temp;
        start++;
        end--;
    } 
};