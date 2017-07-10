package com.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Event {

    @NonNull private final int id;
    @NonNull private final String name;
    @NonNull private final String venue;
    @NonNull private final long time;
}