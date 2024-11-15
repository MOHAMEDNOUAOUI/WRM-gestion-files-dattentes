package com.wora.waitinglistforanyproject.helpers;

import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforFIFO;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforPriority;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforSJF;
import com.wora.waitinglistforanyproject.Entity.VisitList;
import com.wora.waitinglistforanyproject.Entity.WaitingList;
import com.wora.waitinglistforanyproject.Mapper.VisitorListMapper;
import com.wora.waitinglistforanyproject.Repository.VisitorListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
@AllArgsConstructor
public class Algorithm {

    private final VisitorListRepository visitorListRepository;
    private final VisitorListMapper visitorListMapper;

    public List<VisitorDTOforFIFO> FIFO(List<VisitList> visitLists) {
        if (visitLists == null) {
            visitLists = new ArrayList<>();
        }
        return visitLists.stream()
                .sorted(Comparator.comparing(VisitList::getArrivalTime))
                .map(visitorListMapper::toFIFO)
                .toList();
    }

    public List<VisitorDTOforPriority> PR(List<VisitList> visitLists){
        if (visitLists == null) {
            visitLists = new ArrayList<>();
        }
        return visitLists.stream()
                .sorted(Comparator.comparingInt(VisitList::getPriority)
                        .thenComparing(VisitList::getArrivalTime))
                .map(visitorListMapper::toPriority)
                .toList();
    }

    public List<VisitorDTOforSJF> SJF(List<VisitList> visitLists){
        if (visitLists == null) {
            visitLists = new ArrayList<>();
        }
        return visitLists.stream()
                .sorted(Comparator.comparingInt(VisitList::getEstimatedProcessingTime))
                .map(visitorListMapper::toSJF)
                .toList();
    }

    public List<?> checkAlgorithm(WaitingList waitingList) {
        switch (waitingList.getAlgorithm()){
            case "FIFO" :
                List<VisitorDTOforFIFO> fifoList = this.FIFO(waitingList.getVisitLists());
                return fifoList;
            case "SJF":
                List<VisitorDTOforSJF> sjfList =  this.SJF(waitingList.getVisitLists());
                return sjfList;
            case "PR":
                List<VisitorDTOforPriority> prList =  this.PR(waitingList.getVisitLists());
                return prList;
            default:
                return new ArrayList<>();
        }
    }

}
