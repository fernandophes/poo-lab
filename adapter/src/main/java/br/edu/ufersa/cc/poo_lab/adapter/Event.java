package br.edu.ufersa.cc.poo_lab.adapter;

import java.time.LocalDateTime;

public class Event {

    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private Address address;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Event [title=" + title + ", start=" + start + ", end=" + end + ", address=" + address + "]";
    }

}
