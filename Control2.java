package com.example.demo.ProjectAha.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProjectAha.Models.Model2;

import com.example.demo.ProjectAha.Repository.Respo2;
@Controller
@RestController
@CrossOrigin("http://localhost:3005")
@RequestMapping("/start")

public class Control2 {
@Autowired
Respo2 repor;
@PostMapping("/logindara")
public String mthd(@RequestBody Model2 d)
{
String user=d.getUsername();

Model2 m=repor.findByUsername(user);
if(m==null)
{
repor.save(d);
return "added";
}
else
{
return "user alredy exist";
}
}


@PostMapping("/login/{user}/{pass}")
public String login(@PathVariable String
user,@PathVariable String pass)
{
Model2 l=repor.findByUsername(user);
if(l == null)
{
return "invalid username";
}
else {

if(l.getPassword().equals(pass))
{
return "success";
}
else
{
return "invalid password";
}
}
}
}




