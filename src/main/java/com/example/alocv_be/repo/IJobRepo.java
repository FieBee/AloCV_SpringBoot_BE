package com.example.alocv_be.repo;

import com.example.alocv_be.model.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

//    @Query(value = "SELECT e.* FROM job as e\n" +
//            "INNER joiN job_field on e.job_field_id =job_field.id\n" +
//            "WHERE e.name = :name AND e.salary_range = :salary_range AND job_field.name = :job_field_name ", nativeQuery = true)
//    List<Job> findJobBy(@Param("name") String name,
//                        @Param("salary_range") Long salaryRange,
//                        @Param("job_field_name") String jobField);


//    @Query(value ="select * from job where\n" +
//            "(SELECT e.* FROM job as e\n" +
//            "INNER joiN job_field on e.job_field_id =job_field.id\n" +
//            "INNER join location on e.location_id = location.id\n" +
//            "WHERE e.name = :name AND e.salary_range = :salary_range AND job_field.name = :job_field_name  AND location.name = :location_name)\n" +
//            "in (SELECT job.* FROM job\n" +
//            "    join company c on jl.company_id = c.id\n" +
//            "    where c.name = :c_name);", nativeQuery = true)
//    List<Job> findJobBy(@Param("name") String name,
//                        @Param("salary_range") Long salaryRange,
//                        @Param("job_field_name") String jobField,
//                        @Param("location_name") String location,
//                        @Param("c_name") String companyName);


}


