#include <jni.h>

// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("quran_ku");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("quran_ku")
//      }
//    }
extern "C"
JNIEXPORT jstring JNICALL
Java_com_needcode_quran_1ku_utility_Credential_getBaseUrl(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("https://api.npoint.io/99c279bb173a6e28359c/");
}