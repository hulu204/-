#include <windows.h>  
#include <stdlib.h>  
#include <stdio.h>  
#include "com_swpu_change_Bri.h"
/*
 * Class:     com_swpu_change_Bri
 * Method:    intSixteen
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_swpu_change_Bri_intSixteen
  (JNIEnv *env, jobject obj, jint n)
  {
  	printf("Hexadecimal : 0x");
  	printf("%x",n);
  }

/*
 * Class:     com_swpu_change_Bri
 * Method:    intAddress
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_swpu_change_Bri_intAddress
  (JNIEnv *env, jobject obj, jint n)
  {
  	printf("Address : 0x");
  	printf("%x\n",&n);
  }

/*
 * Class:     com_swpu_change_Bri
 * Method:    floatSixteen
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_com_swpu_change_Bri_floatSixteen
  (JNIEnv *env, jobject obj, jfloat f)
  {
  	union {
		float a;
		unsigned b;
	} ab;
	ab.a = f;
  	printf("Hexadecimal : 0x");
  	printf("%x",ab.b);
  }

/*
 * Class:     com_swpu_change_Bri
 * Method:    floatAddress
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_com_swpu_change_Bri_floatAddress
  (JNIEnv *env, jobject obj, jfloat f)
  {
  	printf("Address : 0x");
  	printf("%x\n",&f);
  }

/*
 * Class:     com_swpu_change_Bri
 * Method:    charSixteen
 * Signature: (C)V
 */
JNIEXPORT void JNICALL Java_com_swpu_change_Bri_charSixteen
  (JNIEnv *env, jobject obj, jchar c)
  {
  	printf("Hexadecimal : 0x");
  	printf("%x",c);
  }

/*
 * Class:     com_swpu_change_Bri
 * Method:    charAddress
 * Signature: (C)V
 */
JNIEXPORT void JNICALL Java_com_swpu_change_Bri_charAddress
  (JNIEnv *env, jobject obj, jchar c)
  {
  	printf("Address : 0x");
  	printf("%x\n",&c);
  }

