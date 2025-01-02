package com.byun.playgroundspring.api

import com.byun.playgroundspring.dto.OkJson
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
class Healthz {
    @GetMapping("/healthz/liveness")
    fun liveness(): ResponseEntity<OkJson> {
        return ResponseEntity.ok(OkJson())
    }

    @GetMapping("/healthz/readiness")
    fun readiness(): ResponseEntity<OkJson> {
        return ResponseEntity.ok(OkJson())
    }
}