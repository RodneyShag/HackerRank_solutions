

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try
    {var splitString=s.split("")
    var reverseArray=splitString.reverse();
    var joinArray=reverseArray.join("");
    console.log(joinArray);
    }

    catch(err)
    {
        console.log(err.message);
    console.log(s)
    }

    
}

