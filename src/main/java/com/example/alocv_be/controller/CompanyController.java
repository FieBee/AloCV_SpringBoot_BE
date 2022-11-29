package com.example.alocv_be.controller;

import com.example.alocv_be.model.Company;
import com.example.alocv_be.service.company.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    ICompanyService companyService;

    @GetMapping
    public ResponseEntity<Iterable<Company>> findAllCompany(Pageable pageable){
        return new ResponseEntity<>(companyService.findAll(pageable),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> findById(@PathVariable Long id){
        return companyService.findById(id).map(account -> new ResponseEntity<>(account, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Company> save(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.save(company), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable Long id, @RequestBody Company company) {
        Optional<Company> companyOptional = companyService.findById(id);
        if (!companyOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        company.setId(companyOptional.get().getId());
        return new ResponseEntity<>(companyService.save(company),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Company> deleteCompany(@PathVariable Long id){
        companyService.remove(id);
        return new ResponseEntity<>(companyService.findById(id).get(),HttpStatus.OK);
    }

    @GetMapping("/getCompany/{userName}")
    public ResponseEntity<Company> findByAccount(@PathVariable String userName) {
        return new ResponseEntity<>(companyService.findCompanyByAccount_UserName(userName).get(), HttpStatus.OK);
    }

    @GetMapping("/setSuggestTrue/{id}")
    public ResponseEntity<Company> setSuggestTrue(@PathVariable Long id){
        Optional<Company> newCompany = companyService.findById(id);
        if (!newCompany.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        newCompany.get().setSuggest(true);
        return new ResponseEntity<>(companyService.save(newCompany.get()),HttpStatus.OK);
    }

    @GetMapping("/setSuggestFalse/{id}")
    public ResponseEntity<Company> setSuggestFalse(@PathVariable Long id){
        Optional<Company> newCompany = companyService.findById(id);
        if (newCompany == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        newCompany.get().setSuggest(false);
        return new ResponseEntity<>(companyService.save(newCompany.get()),HttpStatus.OK);
    }



    @GetMapping("/suggest")
    public ResponseEntity<Iterable<Company>> getCompanyBySuggestIsTrue(){
        List<Company> companies  = companyService.getCompanyBySuggestIsTrue();
        if (companies.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(companies,HttpStatus.OK);
    }

    @GetMapping("/pagingcompany")
    public ResponseEntity<Iterable<Company>> pagingCompany(@RequestParam("p") Integer p, @RequestParam("psize") Integer pageSize) {
        List<Company> listJob = companyService.getAllCompany(p, pageSize);
        return new ResponseEntity<>(listJob, HttpStatus.OK);
    }
}
