
/*
 * Create the function factorial here
 */
function factorial(v)
{
    v=Number(v);
    let fact=1;
    for (let i=2;i<=v;i++)
        fact=fact*i;
    return fact;
}

