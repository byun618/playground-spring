package com.byun.playgroundspring.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class Healthz {
    @GetMapping("/healthz/liveness")
    fun liveness(): String {
        return "liveness"
    }

    @GetMapping("/healthz/readiness")
    fun readiness(): String {
        return "readiness"
    }


}