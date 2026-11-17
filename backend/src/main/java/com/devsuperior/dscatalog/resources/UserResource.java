package com.devsuperior.dscatalog.resources;

import java.net.URI;
//import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
import javax.validation.Valid;

=======
>>>>>>> 37dc948 (User CRUD)
=======
import javax.validation.Valid;

>>>>>>> 3270e3f (Basic Beans Validation)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dscatalog.dto.UserDTO;
import com.devsuperior.dscatalog.dto.UserInsertDTO;
import com.devsuperior.dscatalog.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<Page<UserDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "firstName") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction
			)
	{
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<UserDTO> list = service.findAllPaged(pageRequest);
		
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id){
		UserDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
		
	}
	
	@PostMapping
<<<<<<< HEAD
<<<<<<< HEAD
	public ResponseEntity<UserDTO> insert(@Valid @RequestBody UserInsertDTO dto){
=======
	public ResponseEntity<UserDTO> insert(@RequestBody UserInsertDTO dto){
>>>>>>> 37dc948 (User CRUD)
=======
	public ResponseEntity<UserDTO> insert(@Valid @RequestBody UserInsertDTO dto){
>>>>>>> 3270e3f (Basic Beans Validation)
		UserDTO newDTO = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newDTO.getId()).toUri();
		
		return ResponseEntity.created(uri).body(newDTO);
	}
	
	@PutMapping(value = "/{id}")
<<<<<<< HEAD
<<<<<<< HEAD
	public ResponseEntity<UserDTO> update(@Valid @PathVariable Long id,@RequestBody UserDTO dto){
=======
	public ResponseEntity<UserDTO> update(@PathVariable Long id,@RequestBody UserDTO dto){
>>>>>>> 37dc948 (User CRUD)
=======
	public ResponseEntity<UserDTO> update(@Valid @PathVariable Long id,@RequestBody UserDTO dto){
>>>>>>> 3270e3f (Basic Beans Validation)
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<UserDTO> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
