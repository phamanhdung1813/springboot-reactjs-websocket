package com.stanleypham.springbootwebsocket.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ChatBody {
    private String senderName;
    private String receiverName;
    private String message;
    private ChatStatus chatStatus;
    private String date;
}
