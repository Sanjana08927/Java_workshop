package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

import java.util.Arrays;

public class GymMembershipRepositoryImpl implements GymMembershipRepository{
    private GymMembershipDetailsDto[] listofDtos = new GymMembershipDetailsDto[2];
    private int index = 0;
    @Override
    public boolean saveDto(GymMembershipDetailsDto dto){
        System.out.println("invoking the GymMembershipRepositoryImpl()");
        System.out.println("dto is:"+dto);
        if(this.index < listofDtos.length){
            listofDtos[this.index] = dto;
            this.index++;
            System.out.println("saved successfully");
            return true;
        }else{
            System.out.println("check my length or array is full");
        }

        return false;
    }
    public void readDto(){
        System.out.println(Arrays.toString(listofDtos));



    }

}
