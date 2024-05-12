import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "event_times",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Event::class,
            parentColumns = ["id"],
            childColumns = ["eventId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class EventTime(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userId: Int, // Идентификатор участника
    val eventId: Int, // Идентификатор события
    val time: Long // Время события (timestamp)
)

