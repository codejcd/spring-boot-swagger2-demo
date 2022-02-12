package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class DemoController {

	   @Operation(summary = "getUserInfoById")
	   @ApiResponses(value = {
			   @ApiResponse(responseCode ="200", description="유저 정보 조회 성공", 
					   content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
	   })
	   @GetMapping("/demo/user/{id}")
	   public ResponseEntity<?> getUserInfoById(@Parameter(description="유저 고유번호") @PathVariable("id") String id){

		   HashMap<String, String> map = new HashMap<>();
		   map.put("id", id);
		   map.put("name", "jack");
		   map.put("email", "jack@abc.com");

	       return new ResponseEntity<>(map, HttpStatus.OK);
	   }

	   @Operation(summary = "registUserInfo")
	   @ApiResponses(value = {
			   @ApiResponse(responseCode ="200", description="유저 등록 성공", 
					   content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
	   })
	   @PostMapping("/demo/user")
	   public ResponseEntity<?> registUserInfo(@Parameter(schema = @Schema(implementation = User.class)) @RequestParam HashMap<String, String> map) {
		   return new ResponseEntity<>(map, HttpStatus.OK);
	   }
}
