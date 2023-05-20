<template>
  <div>
    {{ props.msg }}
  </div>
</template>

<script setup lang="ts">
const props = defineProps<{
  msg: string | null;
}>();

console.log(props);
</script>
