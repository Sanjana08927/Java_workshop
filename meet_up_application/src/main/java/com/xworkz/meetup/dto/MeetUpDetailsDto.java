package com.xworkz.meetup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class MeetUpDetailsDto {
private int data;
private String time;
private String date;
private String personName;
private String place;
private String gift;
private LocalDateTime createdOn;
private String createdBy;
private LocalDateTime updatedOn;
private String updatedBy;



}
