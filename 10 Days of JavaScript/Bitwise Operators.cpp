
function getMaxLessThanK(n, k)
{
   let res=0,ans;
  
   for (let i=1;i<=n-1;i++)
   {
       for(let j=i+1;j<=n;j++)
            {
                ans=i&j;
                if (ans>res && ans<k)
                    res=ans;
            }
   }
   return res;
}
