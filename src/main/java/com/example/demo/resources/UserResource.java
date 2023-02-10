package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserInsertDTO;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping
	ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> userDTO = service.findAll();
		return ResponseEntity.ok().body(userDTO);
	}

	@GetMapping(value = "{id}")
	ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		UserDTO userDTO = service.findById(id);
		return ResponseEntity.ok().body(userDTO);
	}

	@PostMapping
	ResponseEntity<UserDTO> insert(@RequestBody UserInsertDTO dto) {
		UserDTO dto2 = service.insert(dto);
		return ResponseEntity.ok().body(dto2);
	}

}
