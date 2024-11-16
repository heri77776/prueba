<script>
        const toggleBtn = document.getElementById('toggle-btn');
        const sidebar = document.getElementById('sidebar');
        const content = document.getElementById('content');
        const interactiveFigure = document.getElementById('interactive-figure');

        toggleBtn.addEventListener('click', () => {
            sidebar.classList.toggle('active');
            content.style.marginLeft = sidebar.classList.contains('active') ? '250px' : '0';
        });

        // Cambiar la figura interactiva de posición suavemente
        document.addEventListener('mousemove', (e) => {
            interactiveFigure.style.transition = 'transform 0.1s';
            interactiveFigure.style.transform = `translate(${e.clientX - 25}px, ${e.clientY - 25}px)`;
        });

        // Cambiar de color y hacer que rebote
        interactiveFigure.addEventListener('click', () => {
            const randomColor = '#' + Math.floor(Math.random() * 16777215).toString(16);
            interactiveFigure.style.backgroundColor = randomColor;
            interactiveFigure.style.transform += ' scale(1.2)';
            setTimeout(() => {
                interactiveFigure.style.transform = interactiveFigure.style.transform.replace(' scale(1.2)', '');
            }, 200);
        });

        // esto redirijea lasotrsf paguinas
        document.querySelectorAll('.category').forEach(category => {
            category.addEventListener('click', () => {
                const url = category.getAttribute('data-url');
                window.location.href = url;
            });
        });
    </script>