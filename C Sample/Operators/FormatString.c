// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    printf("Hello world");
    printf("Formatting String\n");
    short _short=3456;
    unsigned short int _ushort=1234;
    printf("S=%d\tUS=%i\n",-3456,_ushort);
    
    unsigned int a=15;
    int b=-20;
    char c={'a','b','c'};
    int a1=100;
    printf("%08d\n",100);
    printf("%-8d",100);

    
    printf("a=%d\t b=%i\ta=%i\n",a,b,a);
    printf("c=%C\n",c+2);
    a='a'+15;
    printf("a=%d\n",a);
    printf("a=%c\n",a);
    printf("\n\n");
    
    long l=-200514;
    long l2=57588484l;
    printf("%ld\t%lu\n",l,l2);
    
    float f=3.2e-3;
    float g=3.14f;
    printf("e=%e\tf=%f\tf=%g\tg=%g\ta=%a\n",f,f,g,f);
    
    //char _;
   // printf("%s",_);
    printf("Number  Con\n");
    int hex=100;
    printf("hex=%x\tHEX=%X\t#x=%#x=%#x\n",hex,hex,hex);
    
    const int _binary =0b0111;
    const int _octal=015;
    const int _hex=0XA3;
    printf("binary=%u\t",_binary);
    printf("binary=%d\n",_binary);
    
    printf("Octal to Hexa = %x\n",_octal);
    printf("Octal = %o\n",_octal);
    printf("Octal to decimal = %d\n",_octal);

    
    
    printf("Hexa to decimal = %d\n",_hex);
    printf("Hexa = %x\n",_hex);
    printf("Hexa to octal = %o\n",_hex);

        

    

    int i=10l;
    printf("i=%d\n",i); //10
    printf("i=%f\n",i);//0.000000

    printf("i=%d\n",&i);//1710121664
    printf("i=%p",&i);//0x7ffe65ee62c0
      
    
    

    

    return 0;
}