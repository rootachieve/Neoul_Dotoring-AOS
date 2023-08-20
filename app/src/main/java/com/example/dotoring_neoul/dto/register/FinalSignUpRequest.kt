package com.example.dotoring_neoul.dto.register

import okhttp3.MultipartBody

// 최종 회원가입 요청 DTO
data class FinalSignUpRequest(
    val certifications: List<MultipartBody.Part?>,
    val mentoSignupRequestDTO: MentoSignupRequestDTO
)