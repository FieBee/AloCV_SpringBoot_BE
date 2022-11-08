package com.example.alocv_be.repo;

import com.example.alocv_be.config.dto.TopJopCompanyDto;
import com.example.alocv_be.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepo extends PagingAndSortingRepository<Company, Long> {
    Optional<Company> findCompanyByAccount_UserName(String userName);

//    phương thức in ra bảng jop có tuyển dung nhiều đến thấp
    @Query("select new com.example.alocv_be.config.dto.TopJopCompanyDto(c.name, j.recruitNumber) from Company c join Job j on c.id = j.id" +
            " order by j.recruitNumber DESC")
    List<TopJopCompanyDto> topJopCompany();
}
