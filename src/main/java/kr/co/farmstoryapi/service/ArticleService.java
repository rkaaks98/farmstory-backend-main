package kr.co.farmstoryapi.service;

import kr.co.farmstoryapi.dto.ArticleDTO;
import kr.co.farmstoryapi.dto.PageRequestDTO;
import kr.co.farmstoryapi.dto.PageResponseDTO;

public interface ArticleService {

    public int register(ArticleDTO articleDTO);

    public PageResponseDTO<ArticleDTO> list(PageRequestDTO pageRequestDTO);
    public ArticleDTO get(int no);
    public void modify(ArticleDTO articleDTO);
    public void remove(int no);

}
