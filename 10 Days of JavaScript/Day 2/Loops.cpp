

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
for (let i=0;i<s.length;i++)
{
    if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt        (i)=='u')
    {
        console.log(s.charAt(i));
    }
} 
   for (let i=0;i<s.length;i++)
{
    if (!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
    {
        console.log(s.charAt(i));
    }
} 
}

