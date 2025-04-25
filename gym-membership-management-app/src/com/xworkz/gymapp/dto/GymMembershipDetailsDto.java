package com.xworkz.gymapp.dto;

import com.xworkz.gymapp.constant.MembershipType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@ToString
public class GymMembershipDetailsDto {
    private int memberId;
    private String memberName;
    private String memberEmailId;
    private long contactNumber;
    private LocalDate issuedDate;
    private LocalTime issuedTime;
    private LocalDate expDate;
    private MembershipType membershipType;

    }

