package kr.co.farmstoryapi.service;

import kr.co.farmstoryapi.dto.TermsDTO;
import kr.co.farmstoryapi.dto.UserDTO;

public interface UserService {


    public String register(UserDTO userDTO);

    public TermsDTO terms();
}
