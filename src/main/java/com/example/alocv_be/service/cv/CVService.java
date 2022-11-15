package com.example.alocv_be.service.cv;

import com.example.alocv_be.model.CV;
import com.example.alocv_be.model.Job;
import com.example.alocv_be.repo.CVRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CVService implements ICVService{
    @Autowired
    private CVRepo cvRepo;
    @Override
    public Iterable<CV> findAll(Pageable pageable) {
        return cvRepo.findAll();
    }

    @Override
    public Optional<CV> findById(Long id) {
        return cvRepo.findById(id);
    }

    @Override
    public CV save(CV cv) {
        return cvRepo.save(cv);
    }

    @Override
    public void remove(Long id) {
        cvRepo.deleteById(id);
    }

    @Override
    public List<CV> findCVByUserId(Long id) {
        return cvRepo.findCVByUserId(id);
    }

    @Override
    public List<CV> findCVByJobId(Long id) {
        return cvRepo.findCVByJobId(id);
    }

    @Override
    public List<CV> findCVByUserIdAndStatusIsTrue(Long id) {
        return cvRepo.findCVByUserIdAndStatusIsTrue(id);
    }
}
