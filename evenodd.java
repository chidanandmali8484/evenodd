public evenodd
{
 public static void main(String args[])
 {
  int i=201;
  int p=0,r=0;
  int psum=0, rsum=0;
  System.out.println("\t==============");
  while(i<=400)
  {
    if(i%2==0)
    {
     p++;
     psum=psum+i;
    }
    else
    {
        r++;
        psum=psum+i;
    } 
      i++;
  }
     System.out.println("\t==============");
     System.out.println("\tTotal even   \t=  "+psum);
     System.out.println("\tTotal odd    \t=  "+rsum);
     System.out.println("\tDiffrence    \t  "+(psum-rsum));
     System.out.println("\tcount  even  \t=   "+p);
     System.out.println("\tcount odd    \t=    "+r);
 }
} 
     
     
     
    