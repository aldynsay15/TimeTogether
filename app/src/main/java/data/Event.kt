import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "events",
    foreignKeys = [
        ForeignKey(entity = User::class,
            parentColumns = ["id"],
            childColumns = ["participantId"],
            onDelete = ForeignKey.CASCADE),
        ForeignKey(entity = EventList::class,
            parentColumns = ["id"],
            childColumns = ["activityId"],
            onDelete = ForeignKey.CASCADE)
    ])
data class Event(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val participantId: Int, // Идентификатор участника (ссылка на таблицу пользователей)
    val activityId: Int // Идентификатор события из EventList
)
