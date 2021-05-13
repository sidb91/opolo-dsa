//Count characters in a string

function countCharInString(str){
    
    let result = {};
    for(let char of str){
        
        if(isAlphanumeric(char)){
            char = char.toLowerCase();
            (result[char] > 0) ? result[char] ++ :  result[char] = 1;
        }
        
    }

    return result;
}

function isAlphanumeric(character){

    let ch = character.charCodeAt(0);

    if(!(ch>47 && ch<58) && //numeric ASCII range
        !(ch>64 && ch<91) && //upper case alphabets
        !(ch>96 && ch<123)){ //lower case alphabets
        return false;
    }
    return true;
}

countCharInString("hello world");

//Other way with regular expression
///[a-z0-9].test(character)/