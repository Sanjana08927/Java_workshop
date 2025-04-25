package com.xworkz.gymapp.runner;


import com.xworkz.gymapp.constant.MembershipType;
import com.xworkz.gymapp.dto.GymMembershipDetailsDto;
import com.xworkz.gymapp.repository.GymMembershipRepository;
import com.xworkz.gymapp.repository.GymMembershipRepositoryImpl;
import com.xworkz.gymapp.service.GymMembershipService;
import com.xworkz.gymapp.service.GymMembershipServiceImplementation;

public class GymMembershipRunner {
    public static void main(String[] args) {
        GymMembershipDetailsDto dto = new GymMembershipDetailsDto();
            dto.setMemberId(1);
            dto.setMemberName("Sanjana");
            dto.setMemberEmailId("sanjana08@gmail.com");
            dto.setMembershipType(MembershipType.DAILY);
            System.out.println(dto.getMemberId());
            System.out.println(dto.getMemberName());
            System.out.println(dto.getMemberEmailId());

            System.out.println(dto.getClass());
            System.out.println(dto.toString());

            GymMembershipRepository gymMembershipRepository = new GymMembershipRepositoryImpl();
            GymMembershipService  service = new GymMembershipServiceImplementation(gymMembershipRepository);
            System.out.println("invoking");
            service.validateDto(dto);
            System.out.println("invoking");
            service.validateDto(dto);
            System.out.println("invoking");
            service.validateDto(dto);
            System.out.println("=======read method======") ;
            service.readDtos();




    }

    }
