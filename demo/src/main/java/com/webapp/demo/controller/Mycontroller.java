package com.webapp.demo.controller;
import com.webapp.demo.StudentRepository;
import com.webapp.demo.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
public class Mycontroller{

    @Autowired
    private StudentRepository stuRepo;

    @PostMapping("/")
    public ResponseEntity<?> adddata(@RequestBody data data1) {
        data save = this.stuRepo.save(data1);
        return ResponseEntity.ok(save);

    }

    @GetMapping("/")
    public ResponseEntity<?> getdata() {

        return ResponseEntity.ok(this.stuRepo.findAll());

    }

    @PutMapping("/")

      public ResponseEntity<data> updatedata(@RequestBody data data1)
     {

       return ResponseEntity.ok(stuRepo.save(data1));

      }

      @DeleteMapping("/{id}")

      public void deletedata(@PathVariable String id)
      {

       stuRepo.deleteById(id);

         }

}