package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMembershipService {
    boolean validateDto(GymMembershipDetailsDto dto);
    void readDtos();
       }
