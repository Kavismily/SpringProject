package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class service
{
	@Autowired
	private Repository repo;

    
	public List<Certificate> listAll()
	{
		return repo.findAll();
	}
	public void save (Certificate certificate)
	{
		repo.save(certificate);
	}
	public Certificate get(Integer id)
	{
		return repo.findById(id).get();
	}
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}

