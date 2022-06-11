package com.zibro.data.util

import javax.inject.Qualifier

/**
 * Retention : 주석이 이진 출력에 저장되고 반사를 위해 표시되는지 여부를 결정
 * Qualifier : 특정 유형에 대해 여러 결합이 정의되어 있을 때 그 유형의 특정 결합을 식별하는데 사용하는 주석
 * */
//메인스레드에서 코루틴을 실행하는 Dispatcher. UI와 상호작용하는 작업을 실행하기 위해서만 사용
@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class DefaultDispatcher

//디스크 또는 네트워크 I/O 작업을 실행하는데 최적화 되어 있는 디스패처.
@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class IODispatcher

//CPU 작업을 많이 사용하는 작업을 기본 스레드 외부에서 실행하도록 최적화 되어 있는 Dispatcher. 정렬 작업이나 JSON 파싱 작업 등에 최적화
@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class MainDispatcher