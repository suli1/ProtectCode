//
// Created by 苏力 on 2017/8/13.
//

#ifndef PROTECTCODE_LOG_H
#define PROTECTCODE_LOG_H

#include <android/log.h>

#define TAG "JniTag"

#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__);
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__);
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__);

#endif //PROTECTCODE_LOG_H
