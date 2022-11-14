package com.example.alocv_be.repo;

import com.example.alocv_be.dto.TopJopCompanyDto;
import com.example.alocv_be.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepo extends PagingAndSortingRepository<Company, Long> {
    Optional<Company> findCompanyByAccount_UserName(String userName);

//    phương thức in ra bảng jop có tuyển dung từ lớn nhất đến thấp nhất
//    @Query("select new com.example.alocv_be.config.dto.TopJopCompanyDto(c.name, j.recruitNumber) from Company c join Job j on c.id = j.id" +
//            " order by j.recruitNumber DESC")

    @Query(value = "select c.id as id, c.name as name, c.image as image, sum(j.recruit_number) as recruitNumber from company c join job j on c.id = j.company_id group by c.name order by recruitNumber DESC",nativeQuery = true)
    List<TopJopCompanyDto> topJopCompany();
}
