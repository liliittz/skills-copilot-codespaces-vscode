Scanner sc=new Scanner(System.in);
     System.out.print("Add meg a-t: ");
     int a=sc.nextInt();
     System.out.print("Add meg b-t: ");
     int b=sc.nextInt();
     System.out.print("Add meg c-t: ");
     int c=sc.nextInt();
     System.out.print("Add meg d-t: ");
     int d=sc.nextInt();
     
     if(c==0 || b+c==0)
     {
     System.out.print("Nincs megoldás, mivel a nevezőben nulla van");
     }
     else
     {
         double x=Math.pow(a,5)/c+Math.PI*a/(b+c);
         System.out.println("Megoldás:"+x);
     }
     
     System.out.print("Add meg a-t: ");
     int aa=sc.nextInt();
     System.out.print("Add meg b-t: ");
     int bb=sc.nextInt();
     System.out.print("Add meg c-t: ");
     int cc=sc.nextInt();
     System.out.print("Add meg d-t: ");
     int dd=sc.nextInt();
     
     if(bb==0)
     {
         System.out.print("Nincs megoldás, mivel a nevezőben nulla van");
     }
     else
     {
        if(((bb<0||dd<0))&&(bb<0||dd<0))
     {
         if(bb<0&&dd<0)
         System.out.print("Nincs megoldás, mivel a négyzetgyök alatt negatív szám van");
     }
        else
     {
         double xx=aa+bb*Math.sqrt(dd/bb);
         System.out.print("Megoldás:"+xx);
     }
    }
System.out.print("Add meg a hőmérsékletet: ");
      int t=sc.nextInt();
     
      if(t>100){System.out.print("Gáz");}
      else
          if(t>0){System.out.print("Cseppfolyós");}
          else{System.out.print("Szilárd");}

System.out.print("Add meg a-t: ");
     int a=sc.nextInt();
     System.out.print("Add meg b-t: ");
     int b=sc.nextInt();
     System.out.print("Add meg c-t: ");
     int c=sc.nextInt();
        
     if(a+b<c||a+b<c||b+c<a){System.out.print("Nem lehet megszerkeszteni");}
     else {if(a*a+b*b=c*c);}??????????
    }


if(a+b>c&&a+b>c&&b+c>a){System.out.print("Megszerkeszthető");}
     if(a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a=b*b)
     {
         System.out.println("Derékszögű");
     }
     else
     {
         System.out.println("Nem derékszögű");
     }
     
    }