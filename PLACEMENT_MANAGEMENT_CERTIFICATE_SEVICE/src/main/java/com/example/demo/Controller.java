package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@Autowired
		private service svc;
		
		@GetMapping("/Certificate")
		
		public List<Certificate> list()
		{
			return svc.listAll();
		}

@GetMapping("/Certificate/{id})")
public ResponseEntity<Certificate> get(@PathVariable Integer id)
{
	try
	{
		Certificate certificate = svc.get(id);
		return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
	}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
		
	


@PostMapping("/Certificate")
public void add(@RequestBody Certificate certificate) 
{
	svc.save(certificate);
}

@PutMapping("/Certificate/{id}")
public ResponseEntity<?> update(@RequestBody Certificate certificate, @PathVariable Integer id)
{
	try
	{
		certificate.setId(id);
		//Certificate existStore = svc.get(id);
		svc.save(certificate);
		return new ResponseEntity<>(HttpStatus.OK);	
	}
	catch (NoSuchElementException e)
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
@DeleteMapping("/Certificate/{id}")
public void delete(@PathVariable Integer id)
{
	svc.delete(id);
}


}
