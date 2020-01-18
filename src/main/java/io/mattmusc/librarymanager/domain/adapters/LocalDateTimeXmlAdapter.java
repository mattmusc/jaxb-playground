package io.mattmusc.librarymanager.domain.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;

public class LocalDateTimeXmlAdapter extends XmlAdapter<String, LocalDateTime> {
    @Override
    public String marshal(LocalDateTime ldt) {
        return ldt.toString();
    }

    @Override
    public LocalDateTime unmarshal(String s) {
        return LocalDateTime.parse(s);
    }
}
