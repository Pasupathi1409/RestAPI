package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Vendor;
import com.example.demo.Repository.VendorRepo;
@Service
public class VendorService {
@Autowired
private VendorRepo vr;
public List<Vendor> getv()
{
	return vr.findAll();
}
public Vendor getv(int id)
{
	return vr.findById(id).orElse(null);
}
public Vendor createv(Vendor v)
{
	return vr.save(v);
}
public Vendor updatev(int id,Vendor v)
{
	if(!vr.existsById(id))
	{
		
		return null;
	}
	v.setId(id);
	return vr.save(v);
}
public void deletev(int id)
{
	vr.deleteById(id);
}
}
