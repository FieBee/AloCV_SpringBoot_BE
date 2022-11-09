package com.example.alocv_be.repo;

import com.example.alocv_be.model.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IJobRepo extends PagingAndSortingRepository<Job, Long> {
    @Query(value = "SELECT e.* FROM job as e\n" +
            "INNER joiN job_field on  e.job_field_id =job_field.id\n" +
            "INNER join location on e.location_id = location.id\n" +
            "INNER join company on e.company_id = company.id\n" +
            "WHERE :name is null or e.name like "+'%'+":name"+'%'  +
            " AND (:salary_range_min is null or :salary_range_max is null or e.salary_range BETWEEN  "+":salary_range_min and :salary_range_max)" +
            " AND (:job_field_name is null or job_field.name like "+'%'+":job_field_name"+ "%)"+
            " AND (:location_name is null or location.name like "+'%'+":location_name"+"%)"+
            " AND (:company_name is null or company.name like "+'%'+":company_name"+"%)", nativeQuery = true)
    List<Job> findJobBy(@Param("name") String name,
                        @Param("salary_range_min") Long salaryRange_min,
                        @Param("salary_range_max") Long salaryRange_max,
                        @Param("job_field_name") String jobField,
                        @Param("location_name") String location,
                        @Param("company_name") String company);


    List<Job> findJobByLocationId(Long id);
    List<Job> findJobByCompanyId(Long id);

}


