package be.ipeters.cp_first.web.model;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/* carlpeters created on 13/12/2024 inside the package - be.ipeters.cp_first.web.model */
public class CpPagedList extends PageImpl<CpDto> {
    public CpPagedList(List<CpDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public CpPagedList(List<CpDto> content) {
        super(content);
    }
}
